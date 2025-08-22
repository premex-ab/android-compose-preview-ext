package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sky device specifications for Android Compose previews.
 *
 * This extension provides Sky device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sky.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sky: Any
  get() = object {
      /** DeviceSpec(manufacturer=Sky, code=B866VH, width=1080, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=B866VH, width=1080,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val B866VH = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sky, code=DV6067Y_SKY, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=DV6067Y_SKY, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV6067Y_SKY = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sky, code=Elite_L55, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=Elite_L55, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ELITE_L55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sky, code=Elite_N55, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=Elite_N55, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ELITE_N55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sky, code=Elite_OctaPlus, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=Elite_OctaPlus,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ELITE_OCTAPLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sky, code=Elite_OctaPlusa2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=Elite_OctaPlusa2,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ELITE_OCTAPLUSA2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sky, code=ELITE_T8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=ELITE_T8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ELITE_T8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sky, code=Elite_T8Plus, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=Elite_T8Plus, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ELITE_T8PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sky, code=Elite_T8PUB, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=Elite_T8PUB, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ELITE_T8PUB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sky, code=Elite_T8PUSA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=Elite_T8PUSA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ELITE_T8PUSA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sky, code=ELITE_US_T8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=ELITE_US_T8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ELITE_US_T8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sky, code=KSTB3226, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=KSTB3226, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KSTB3226 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sky, code=Platinum_A7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=Platinum_A7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PLATINUM_A7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Sky, code=PLATINUM_VIEW2, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=PLATINUM_VIEW2,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val PLATINUM_VIEW2 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sky, code=PLATINUM_VIEW2_PLUS, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=PLATINUM_VIEW2_PLUS,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val PLATINUM_VIEW2_PLUS = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sky, code=Platinum_View2_V2, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=Platinum_View2_V2,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val PLATINUM_VIEW2_V2 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sky, code=Premier5_US, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=Premier5_US, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PREMIER5_US = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sky, code=SEI800SKM, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sky, code=SEI800SKM, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI800SKM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
