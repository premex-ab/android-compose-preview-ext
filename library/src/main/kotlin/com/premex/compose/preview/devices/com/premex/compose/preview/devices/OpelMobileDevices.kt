package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Opel_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Opel_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OpelMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OpelMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=Opel_Mobile, code=Easy_Smart_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Opel_Mobile, code=Easy_Smart_2,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val EASY_SMART_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Opel_Mobile, code=OMS5525B, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Opel_Mobile, code=OMS5525B,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val OMS5525B = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Opel_Mobile, code=OMS55Q23B, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Opel_Mobile, code=OMS55Q23B,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val OMS55Q23B = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Opel_Mobile, code=OMS65E24B, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Opel_Mobile, code=OMS65E24B,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val OMS65E24B = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Opel_Mobile, code=OMS65Q23B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Opel_Mobile, code=OMS65Q23B,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val OMS65Q23B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Opel_Mobile, code=OMS65R24B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Opel_Mobile, code=OMS65R24B,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val OMS65R24B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Opel_Mobile, code=OMSX6524B, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Opel_Mobile, code=OMSX6524B,
      width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val OMSX6524B = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Opel_Mobile, code=SmartX6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Opel_Mobile, code=SmartX6,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val SMARTX6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Opel_Mobile, code=SmartZ6, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Opel_Mobile, code=SmartZ6,
      width=720, height=1560, dpi=300, isGoogleDevice=false).code */
      val SMARTZ6 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Opel_Mobile, code=Smart_J2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Opel_Mobile, code=Smart_J2,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val SMART_J2 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
