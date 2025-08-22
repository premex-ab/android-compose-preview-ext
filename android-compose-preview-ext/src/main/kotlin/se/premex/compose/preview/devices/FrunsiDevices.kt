package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Frunsi device specifications for Android Compose previews.
 *
 * This extension provides Frunsi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Frunsi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Frunsi: Any
  get() = object {
      /** Frunsi RubensTab_T11 */
      val RUBENSTAB_T11 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Frunsi RubensTab_T8 */
      val RUBENSTAB_T8 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Frunsi T11Pro */
      val T11PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
