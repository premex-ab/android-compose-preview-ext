package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TanoshiScholar device specifications for Android Compose previews.
 *
 * This extension provides TanoshiScholar device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tanoshischolar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tanoshischolar: Any
  get() = object {
      /** TanoshiScholar TTBKB10-A1 */
      val TTBKB10_A1 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
