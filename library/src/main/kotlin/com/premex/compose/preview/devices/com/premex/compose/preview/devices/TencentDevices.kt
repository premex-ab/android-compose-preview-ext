package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tencent device specifications for Android Compose previews.
 *
 * This extension provides Tencent device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tencent.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tencent: Any
  get() = object {
      /** DeviceSpec(manufacturer=Tencent, code=virtual_machine_2, width=900, height=1600, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tencent, code=virtual_machine_2,
      width=900, height=1600, dpi=240, isGoogleDevice=false).code */
      val VIRTUAL_MACHINE_2 = "spec:width=900,height=1600,unit=px,dpi=240"

  }
