package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Maraphones device specifications for Android Compose previews.
 *
 * This extension provides Maraphones device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maraphones.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maraphones: Any
  get() = object {
      /** Maraphones Mara_S */
      val MARA_S = "spec:width=480,height=960,unit=px,dpi=240"

  }
