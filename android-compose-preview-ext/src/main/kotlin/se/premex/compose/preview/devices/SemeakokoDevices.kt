package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Semeakoko device specifications for Android Compose previews.
 *
 * This extension provides Semeakoko device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Semeakoko.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Semeakoko: Any
  get() = object {
      /** Semeakoko M_766 */
      val M_766 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Semeakoko S10A */
      val S10A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Semeakoko SS10A */
      val SS10A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Semeakoko SS10A_EEA */
      val SS10A_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Semeakoko SS-35 */
      val SS_35 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Semeakoko SS-35_EEA */
      val SS_35_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Semeakoko SS-P30 */
      val SS_P30 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Semeakoko SS-P30_EEA */
      val SS_P30_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Semeakoko S-764 */
      val S_764 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Semeakoko S-764-EEA */
      val S_764_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
