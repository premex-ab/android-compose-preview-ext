package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * COLORROOM device specifications for Android Compose previews.
 *
 * This extension provides COLORROOM device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Colorroom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Colorroom: Any
  get() = object {
      /** COLORROOM A30_Plus */
      val A30_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM A5 */
      val A5 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM C1 */
      val C1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM C10_ROW */
      val C10_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM C2 */
      val C2 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** COLORROOM C20 */
      val C20 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** COLORROOM C30_Pro */
      val C30_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM C3_Pro_EEA */
      val C3_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM C3_Pro_ROW */
      val C3_PRO_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM C3_ROW */
      val C3_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM C5 */
      val C5 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM C5_EEA */
      val C5_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM C5_Pro */
      val C5_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM E07 */
      val E07 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** COLORROOM E20 */
      val E20 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** COLORROOM E20_ROW */
      val E20_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** COLORROOM E30_Pro */
      val E30_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM E5 */
      val E5 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM K07-pro_EEA */
      val K07_PRO_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** COLORROOM K10 */
      val K10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM K10C */
      val K10C = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM K12 */
      val K12 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** COLORROOM K12E */
      val K12E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** COLORROOM K12E_EEA */
      val K12E_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** COLORROOM K12E_ROW */
      val K12E_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** COLORROOM K12-EEA */
      val K12_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COLORROOM T30E */
      val T30E = "spec:width=800,height=1280,unit=px,dpi=213"

  }
