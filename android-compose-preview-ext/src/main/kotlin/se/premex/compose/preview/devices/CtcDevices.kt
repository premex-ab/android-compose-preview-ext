package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ctc device specifications for Android Compose previews.
 *
 * This extension provides ctc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ctc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ctc: Any
  get() = object {
      /** ctc sti6130d353 */
      val STI6130D353 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
