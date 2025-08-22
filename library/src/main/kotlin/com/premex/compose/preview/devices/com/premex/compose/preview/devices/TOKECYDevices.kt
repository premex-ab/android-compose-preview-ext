package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TOKECY device specifications for Android Compose previews.
 *
 * This extension provides TOKECY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TOKECY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TOKECY: Any
  get() = object {
      /** DeviceSpec(manufacturer=TOKECY, code=T847, width=800, height=1332, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOKECY, code=T847, width=800,
      height=1332, dpi=160, isGoogleDevice=false).code */
      val T847 = "spec:width=800,height=1332,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TOKECY, code=T847_EEA, width=800, height=1332, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOKECY, code=T847_EEA, width=800,
      height=1332, dpi=160, isGoogleDevice=false).code */
      val T847_EEA = "spec:width=800,height=1332,unit=px,dpi=160"

  }
