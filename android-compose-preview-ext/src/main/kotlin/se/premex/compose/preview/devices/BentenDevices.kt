package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Benten device specifications for Android Compose previews.
 *
 * This extension provides Benten device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Benten.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Benten: Any
  get() = object {
      /** Benten Benten_T10 */
      val BENTEN_T10 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Benten Benten_T20 */
      val BENTEN_T20 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Benten Benten_T30 */
      val BENTEN_T30 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** Benten T8 */
      val T8 = "spec:width=800,height=1280,unit=px,dpi=320"

  }
