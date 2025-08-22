package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vodafone device specifications for Android Compose previews.
 *
 * This extension provides Vodafone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vodafone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vodafone: Any
  get() = object {
      /** DeviceSpec(manufacturer=Vodafone, code=HP46D, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=HP46D, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HP46D = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vodafone, code=m377_vf, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=m377_vf, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val M377_VF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vodafone, code=m393gena_vf, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=m393gena_vf,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val M393GENA_VF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vodafone, code=msm8916_32, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=msm8916_32,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val MSM8916_32 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vodafone, code=P731V35, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=P731V35, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val P731V35 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Vodafone, code=P809V50, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=P809V50, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P809V50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vodafone, code=P839V55, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=P839V55, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P839V55 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vodafone, code=smart_grand, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=smart_grand,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val SMART_GRAND = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=Tab7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=Tab7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Vodafone, code=uiw4030vha, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=uiw4030vha,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UIW4030VHA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vodafone, code=VF685, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VF685, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val VF685 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Vodafone, code=VF695, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VF695, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val VF695 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD100, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD100, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val VFD100 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD1300, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD1300, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val VFD1300 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD1400, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD1400, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val VFD1400 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD300, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD300, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val VFD300 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD301, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD301, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val VFD301 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD320, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD320, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val VFD320 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD500, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD500, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val VFD500 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD501, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD501, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val VFD501 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD502, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD502, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val VFD502 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD510, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD510, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val VFD510 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD511, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD511, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val VFD511 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD513, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD513, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val VFD513 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD525, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD525, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val VFD525 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD527, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD527, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val VFD527 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD528, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD528, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val VFD528 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD529, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD529, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val VFD529 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD610, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD610, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VFD610 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD620, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD620, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val VFD620 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD630, width=720, height=1498, dpi=340,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD630, width=720,
      height=1498, dpi=340, isGoogleDevice=false).code */
      val VFD630 = "spec:width=720,height=1498,unit=px,dpi=340"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD700, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD700, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val VFD700 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD710, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD710, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val VFD710 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD720, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD720, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val VFD720 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD730, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD730, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val VFD730 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD820, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD820, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val VFD820 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD822, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD822, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val VFD822 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vodafone, code=VFD900, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VFD900, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val VFD900 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=Vodafone, code=VF-895N, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=VF-895N, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VF_895N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vodafone, code=Vodafone985N, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=Vodafone985N,
      width=540, height=960, dpi=240, isGoogleDevice=false).code */
      val VODAFONE985N = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=VodafoneSmart4turbo, width=480, height=854,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone,
      code=VodafoneSmart4turbo, width=480, height=854, dpi=213, isGoogleDevice=false).code */
      val VODAFONESMART4TURBO = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vodafone, code=Vodafone_785, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=Vodafone_785,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val VODAFONE_785 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vodafone, code=Vodafone_Smart_Tab_3G, width=540, height=960,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone,
      code=Vodafone_Smart_Tab_3G, width=540, height=960, dpi=160, isGoogleDevice=false).code */
      val VODAFONE_SMART_TAB_3G = "spec:width=540,height=960,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Vodafone, code=Vodafone_Smart_Tab_4, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone,
      code=Vodafone_Smart_Tab_4, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val VODAFONE_SMART_TAB_4 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vodafone, code=Vodafone_Smart_Tab_4G, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone,
      code=Vodafone_Smart_Tab_4G, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val VODAFONE_SMART_TAB_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vodafone, code=Vodafone_Tab_Prime, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone,
      code=Vodafone_Tab_Prime, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val VODAFONE_TAB_PRIME = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vodafone, code=Vodafone_Tab_speed_6, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone,
      code=Vodafone_Tab_speed_6, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val VODAFONE_TAB_SPEED_6 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vodafone, code=voda_tab, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vodafone, code=voda_tab, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VODA_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

  }
