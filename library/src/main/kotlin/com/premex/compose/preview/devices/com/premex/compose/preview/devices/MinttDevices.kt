package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mintt device specifications for Android Compose previews.
 *
 * This extension provides Mintt device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mintt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mintt: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mintt, code=Blaze_3, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=Blaze_3, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val BLAZE_3 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mintt, code=COOLMINTT_NIU, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=COOLMINTT_NIU,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val COOLMINTT_NIU = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mintt, code=CoolMintt_Rival_2, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=CoolMintt_Rival_2,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val COOLMINTT_RIVAL_2 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mintt, code=COOLMINTT_RIVAL_3, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=COOLMINTT_RIVAL_3,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val COOLMINTT_RIVAL_3 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mintt, code=COOLMINTT_X7, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=COOLMINTT_X7,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val COOLMINTT_X7 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mintt, code=COOLMINTT_X9, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=COOLMINTT_X9,
      width=720, height=1600, dpi=480, isGoogleDevice=false).code */
      val COOLMINTT_X9 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Mintt, code=MinttPoro, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=MinttPoro, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MINTTPORO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mintt, code=MINTT_DIGI_2, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=MINTT_DIGI_2,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val MINTT_DIGI_2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mintt, code=P25, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=P25, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P25 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mintt, code=P25_PLUS, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=P25_PLUS, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val P25_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mintt, code=UltraMinttT10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=UltraMinttT10,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ULTRAMINTTT10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mintt, code=UltraMinttT2, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=UltraMinttT2,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val ULTRAMINTTT2 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mintt, code=ULTRAMINTT_A5, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=ULTRAMINTT_A5,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val ULTRAMINTT_A5 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mintt, code=ULTRAMINTT_A6, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=ULTRAMINTT_A6,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val ULTRAMINTT_A6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mintt, code=ULTRAMINTT_X5, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=ULTRAMINTT_X5,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val ULTRAMINTT_X5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mintt, code=ULTRAMINTT_X6, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=ULTRAMINTT_X6,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val ULTRAMINTT_X6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mintt, code=ULTRAMINTT_Y3, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=ULTRAMINTT_Y3,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val ULTRAMINTT_Y3 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Mintt, code=ULTRAMINTT_Y5, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mintt, code=ULTRAMINTT_Y5,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val ULTRAMINTT_Y5 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
