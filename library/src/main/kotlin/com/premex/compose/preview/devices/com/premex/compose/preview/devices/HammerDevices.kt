package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hammer device specifications for Android Compose previews.
 *
 * This extension provides Hammer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hammer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hammer: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hammer, code=Energy_2_2022, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hammer, code=Energy_2_2022,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ENERGY_2_2022 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hammer, code=Explorer_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hammer, code=Explorer_Plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val EXPLORER_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hammer, code=Hammer_Blade_3, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hammer, code=Hammer_Blade_3,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val HAMMER_BLADE_3 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hammer, code=Hammer_Blade_4, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hammer, code=Hammer_Blade_4,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val HAMMER_BLADE_4 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hammer, code=Hammer_Blade_5G, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hammer, code=Hammer_Blade_5G,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val HAMMER_BLADE_5G = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hammer, code=Hammer_Construction, width=1080, height=2160,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hammer,
      code=Hammer_Construction, width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val HAMMER_CONSTRUCTION = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hammer, code=Hammer_Expl_Pro, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hammer, code=Hammer_Expl_Pro,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val HAMMER_EXPL_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hammer, code=HS2302x, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hammer, code=HS2302x, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HS2302X = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hammer, code=HS2401x, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hammer, code=HS2401x, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val HS2401X = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hammer, code=HS2402, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hammer, code=HS2402, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val HS2402 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hammer, code=HS2403x, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hammer, code=HS2403x, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val HS2403X = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hammer, code=HS2404x, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hammer, code=HS2404x, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val HS2404X = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hammer, code=HS2512, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hammer, code=HS2512, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val HS2512 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
