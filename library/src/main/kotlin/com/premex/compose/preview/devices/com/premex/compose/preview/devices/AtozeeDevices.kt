package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Atozee device specifications for Android Compose previews.
 *
 * This extension provides Atozee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Atozee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Atozee: Any
  get() = object {
      /** DeviceSpec(manufacturer=Atozee, code=AT70K, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Atozee, code=AT70K, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val AT70K = "spec:width=600,height=1024,unit=px,dpi=160"

  }
