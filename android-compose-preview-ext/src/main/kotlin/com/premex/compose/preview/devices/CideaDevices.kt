package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cidea device specifications for Android Compose previews.
 *
 * This extension provides Cidea device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cidea.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cidea: Any
  get() = object {
      /** Cidea CM14000Plus */
      val CM14000PLUS = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Cidea CM76_EEA */
      val CM76_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Cidea CM77 */
      val CM77 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Cidea CM81_EEA */
      val CM81_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Cidea CM82 */
      val CM82 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Cidea CM826 */
      val CM826 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Cidea CM90 */
      val CM90 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Cidea CM91_EEA */
      val CM91_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Cidea CM92_EEA */
      val CM92_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Cidea CM93 */
      val CM93 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Cidea P1100 */
      val P1100 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Cidea P1150 */
      val P1150 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
