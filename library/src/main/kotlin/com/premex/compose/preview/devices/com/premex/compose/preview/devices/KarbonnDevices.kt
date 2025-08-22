package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Karbonn device specifications for Android Compose previews.
 *
 * This extension provides Karbonn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Karbonn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Karbonn: Any
  get() = object {
      /** DeviceSpec(manufacturer=Karbonn, code=A1_Indian, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=A1_Indian, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val A1_INDIAN = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Karbonn, code=A40_Indian, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=A40_Indian,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val A40_INDIAN = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Karbonn, code=A40_Indian_Plus, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=A40_Indian_Plus,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val A40_INDIAN_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Karbonn, code=A41_Power, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=A41_Power, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val A41_POWER = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Karbonn, code=AuraNote4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=AuraNote4G,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val AURANOTE4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Karbonn, code=AuraPower4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=AuraPower4G,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val AURAPOWER4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Karbonn, code=Aura_Power_4G_Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=Aura_Power_4G_Plus,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val AURA_POWER_4G_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Karbonn, code=K9Smart4G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=K9Smart4G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val K9SMART4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Karbonn, code=K9_Smart_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=K9_Smart_Plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val K9_SMART_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Karbonn, code=K9_Smart_Yuva, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=K9_Smart_Yuva,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val K9_SMART_YUVA = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Karbonn, code=K9_Viraat_Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=K9_Viraat_Plus,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val K9_VIRAAT_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Karbonn, code=Platinum_P9, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=Platinum_P9,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val PLATINUM_P9 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Karbonn, code=Platinum_P9_Pro, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=Platinum_P9_Pro,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val PLATINUM_P9_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Karbonn, code=Titanium_Jumbo, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=Titanium_Jumbo,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val TITANIUM_JUMBO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Karbonn, code=Titanium_Jumbo_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=Titanium_Jumbo_2,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val TITANIUM_JUMBO_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Karbonn, code=Titanium_S9Plus, width=600, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=Titanium_S9Plus,
      width=600, height=1280, dpi=320, isGoogleDevice=false).code */
      val TITANIUM_S9PLUS = "spec:width=600,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Karbonn, code=X21, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Karbonn, code=X21, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val X21 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
