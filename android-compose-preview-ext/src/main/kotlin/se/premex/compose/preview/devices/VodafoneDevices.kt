package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

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
      /** Vodafone HP46D */
      val HP46D = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Vodafone m377_vf */
      val M377_VF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Vodafone m393gena_vf */
      val M393GENA_VF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Vodafone msm8916_32 */
      val MSM8916_32 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Vodafone P731V35 */
      val P731V35 = "spec:width=320,height=480,unit=px,dpi=160"

      /** Vodafone P809V50 */
      val P809V50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vodafone P839V55 */
      val P839V55 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Vodafone smart_grand */
      val SMART_GRAND = "spec:width=480,height=854,unit=px,dpi=240"

      /** Vodafone Tab7 */
      val TAB7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Vodafone uiw4030vha */
      val UIW4030VHA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Vodafone VF685 */
      val VF685 = "spec:width=320,height=480,unit=px,dpi=160"

      /** Vodafone VF695 */
      val VF695 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Vodafone VFD100 */
      val VFD100 = "spec:width=320,height=480,unit=px,dpi=160"

      /** Vodafone VFD1300 */
      val VFD1300 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Vodafone VFD1400 */
      val VFD1400 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Vodafone VFD300 */
      val VFD300 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Vodafone VFD301 */
      val VFD301 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Vodafone VFD320 */
      val VFD320 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Vodafone VFD500 */
      val VFD500 = "spec:width=480,height=854,unit=px,dpi=213"

      /** Vodafone VFD501 */
      val VFD501 = "spec:width=480,height=854,unit=px,dpi=213"

      /** Vodafone VFD502 */
      val VFD502 = "spec:width=480,height=854,unit=px,dpi=213"

      /** Vodafone VFD510 */
      val VFD510 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Vodafone VFD511 */
      val VFD511 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Vodafone VFD513 */
      val VFD513 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Vodafone VFD525 */
      val VFD525 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Vodafone VFD527 */
      val VFD527 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Vodafone VFD528 */
      val VFD528 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Vodafone VFD529 */
      val VFD529 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Vodafone VFD610 */
      val VFD610 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vodafone VFD620 */
      val VFD620 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Vodafone VFD630 */
      val VFD630 = "spec:width=720,height=1498,unit=px,dpi=340"

      /** Vodafone VFD700 */
      val VFD700 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Vodafone VFD710 */
      val VFD710 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Vodafone VFD720 */
      val VFD720 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Vodafone VFD730 */
      val VFD730 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Vodafone VFD820 */
      val VFD820 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Vodafone VFD822 */
      val VFD822 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Vodafone VFD900 */
      val VFD900 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** Vodafone VF-895N */
      val VF_895N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vodafone Vodafone985N */
      val VODAFONE985N = "spec:width=540,height=960,unit=px,dpi=240"

      /** Vodafone VodafoneSmart4turbo */
      val VODAFONESMART4TURBO = "spec:width=480,height=854,unit=px,dpi=213"

      /** Vodafone Vodafone_785 */
      val VODAFONE_785 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Vodafone Vodafone_Smart_Tab_3G */
      val VODAFONE_SMART_TAB_3G = "spec:width=540,height=960,unit=px,dpi=160"

      /** Vodafone Vodafone_Smart_Tab_4 */
      val VODAFONE_SMART_TAB_4 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Vodafone Vodafone_Smart_Tab_4G */
      val VODAFONE_SMART_TAB_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Vodafone Vodafone_Tab_Prime */
      val VODAFONE_TAB_PRIME = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Vodafone Vodafone_Tab_speed_6 */
      val VODAFONE_TAB_SPEED_6 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Vodafone voda_tab */
      val VODA_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

  }
