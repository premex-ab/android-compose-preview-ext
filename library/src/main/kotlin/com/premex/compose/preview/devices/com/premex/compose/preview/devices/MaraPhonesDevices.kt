package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mara_Phones device specifications for Android Compose previews.
 *
 * This extension provides Mara_Phones device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MaraPhones.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MaraPhones: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mara_Phones, code=Mara_X1, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mara_Phones, code=Mara_X1,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val MARA_X1 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mara_Phones, code=Mara_X1_d, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mara_Phones, code=Mara_X1_d,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val MARA_X1_D = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mara_Phones, code=Mara_Z1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mara_Phones, code=Mara_Z1,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val MARA_Z1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mara_Phones, code=Mara_Z1_d, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mara_Phones, code=Mara_Z1_d,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val MARA_Z1_D = "spec:width=720,height=1600,unit=px,dpi=320"

  }
