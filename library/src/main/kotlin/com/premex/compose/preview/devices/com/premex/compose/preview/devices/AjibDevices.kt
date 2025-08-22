package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ajib device specifications for Android Compose previews.
 *
 * This extension provides ajib device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ajib.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ajib: Any
  get() = object {
      /** DeviceSpec(manufacturer=ajib, code=ajib_i10, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ajib, code=ajib_i10, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val AJIB_I10 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ajib, code=ajib_l1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ajib, code=ajib_l1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AJIB_L1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ajib, code=ajib_X1, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ajib, code=ajib_X1, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val AJIB_X1 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ajib, code=i15, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ajib, code=i15, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val I15 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ajib, code=i25, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ajib, code=i25, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val I25 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
