package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KOOLMAAX device specifications for Android Compose previews.
 *
 * This extension provides KOOLMAAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Koolmaax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Koolmaax: Any
  get() = object {
      /** KOOLMAAX GEMINI */
      val GEMINI = "spec:width=480,height=960,unit=px,dpi=220"

  }
