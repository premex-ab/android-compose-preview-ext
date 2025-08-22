package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * i-Scream device specifications for Android Compose previews.
 *
 * This extension provides i-Scream device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IScream.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IScream: Any
  get() = object {
      /** i-Scream HL106 */
      val HL106 = "spec:width=1200,height=1920,unit=px,dpi=213"

  }
