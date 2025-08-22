package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * G_TOUCH device specifications for Android Compose previews.
 *
 * This extension provides G_TOUCH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GTouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GTouch: Any
  get() = object {
      /** G_TOUCH Stella_Omega */
      val STELLA_OMEGA = "spec:width=1080,height=2220,unit=px,dpi=440"

      /** G_TOUCH Stella_Omega_Plus */
      val STELLA_OMEGA_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** G_TOUCH Stella_XS */
      val STELLA_XS = "spec:width=480,height=960,unit=px,dpi=240"

      /** G_TOUCH Stella_X_Plus */
      val STELLA_X_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

  }
