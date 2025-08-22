package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MAXLEGEN device specifications for Android Compose previews.
 *
 * This extension provides MAXLEGEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maxlegen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maxlegen: Any
  get() = object {
      /** MAXLEGEN M621 */
      val M621 = "spec:width=1400,height=2240,unit=px,dpi=240"

      /** MAXLEGEN M621-EEA */
      val M621_EEA = "spec:width=1400,height=2240,unit=px,dpi=240"

  }
