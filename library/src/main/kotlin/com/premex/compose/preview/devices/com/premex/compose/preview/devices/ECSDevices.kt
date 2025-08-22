package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ECS device specifications for Android Compose previews.
 *
 * This extension provides ECS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ECS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ECS: Any
  get() = object {
      /** DeviceSpec(manufacturer=ECS, code=TU11MK2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ECS, code=TU11MK2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TU11MK2 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
