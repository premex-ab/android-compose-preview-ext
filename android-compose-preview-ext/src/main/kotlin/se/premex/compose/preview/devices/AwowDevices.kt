package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AWOW device specifications for Android Compose previews.
 *
 * This extension provides AWOW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Awow.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Awow: Any
  get() = object {
      /** AWOW AWOW_CreaPad_1001 */
      val AWOW_CREAPAD_1001 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** AWOW AWOW_CreaPad_1003_EEA */
      val AWOW_CREAPAD_1003_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** AWOW CQA1019_EEA */
      val CQA1019_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AWOW CreaPad_1005 */
      val CREAPAD_1005 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** AWOW CreaPad_1005_EEA */
      val CREAPAD_1005_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** AWOW CreaPad_1009 */
      val CREAPAD_1009 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** AWOW CreaPad_1009S */
      val CREAPAD_1009S = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** AWOW CreaPad_1009_EEA */
      val CREAPAD_1009_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** AWOW CUBTAB_1001 */
      val CUBTAB_1001 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AWOW Funtab_1001 */
      val FUNTAB_1001 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AWOW Funtab_1001_EEA */
      val FUNTAB_1001_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AWOW Funtab_1003_EEA */
      val FUNTAB_1003_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AWOW Funtab_1003_US */
      val FUNTAB_1003_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AWOW Funtab_801_I_EEA */
      val FUNTAB_801_I_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AWOW Funtab_801_K_EEA */
      val FUNTAB_801_K_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AWOW MID_1085_EEA */
      val MID_1085_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** AWOW MID_1089IPS_EEA */
      val MID_1089IPS_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AWOW MID_789A100_EEA */
      val MID_789A100_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** AWOW P11_EEA */
      val P11_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AWOW UTBook */
      val UTBOOK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AWOW UTBook_14 */
      val UTBOOK_14 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AWOW UTBook_EEA */
      val UTBOOK_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
