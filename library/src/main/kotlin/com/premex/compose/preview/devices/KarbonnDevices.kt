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
      /** Karbonn A1_Indian */
      val A1_INDIAN = "spec:width=480,height=800,unit=px,dpi=240"

      /** Karbonn A40_Indian */
      val A40_INDIAN = "spec:width=480,height=800,unit=px,dpi=240"

      /** Karbonn A40_Indian_Plus */
      val A40_INDIAN_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

      /** Karbonn A41_Power */
      val A41_POWER = "spec:width=480,height=800,unit=px,dpi=240"

      /** Karbonn AuraNote4G */
      val AURANOTE4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Karbonn AuraPower4G */
      val AURAPOWER4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Karbonn Aura_Power_4G_Plus */
      val AURA_POWER_4G_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Karbonn K9Smart4G */
      val K9SMART4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** Karbonn K9_Smart_Plus */
      val K9_SMART_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Karbonn K9_Smart_Yuva */
      val K9_SMART_YUVA = "spec:width=480,height=854,unit=px,dpi=240"

      /** Karbonn K9_Viraat_Plus */
      val K9_VIRAAT_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** Karbonn Platinum_P9 */
      val PLATINUM_P9 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Karbonn Platinum_P9_Pro */
      val PLATINUM_P9_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** Karbonn Titanium_Jumbo */
      val TITANIUM_JUMBO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Karbonn Titanium_Jumbo_2 */
      val TITANIUM_JUMBO_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Karbonn Titanium_S9Plus */
      val TITANIUM_S9PLUS = "spec:width=600,height=1280,unit=px,dpi=320"

      /** Karbonn X21 */
      val X21 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
