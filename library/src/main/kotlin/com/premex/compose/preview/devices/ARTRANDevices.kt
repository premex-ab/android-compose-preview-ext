package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARTRAN device specifications for Android Compose previews.
 *
 * This extension provides ARTRAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARTRAN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARTRAN: Any
  get() = object {
      /** ARTRAN ARTRAN_EI101F */
      val ARTRAN_EI101F = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** ARTRAN AZ101F */
      val AZ101F = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** ARTRAN IB101F_Pro */
      val IB101F_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** ARTRAN IB868H */
      val IB868H = "spec:width=800,height=1340,unit=px,dpi=180"

  }
