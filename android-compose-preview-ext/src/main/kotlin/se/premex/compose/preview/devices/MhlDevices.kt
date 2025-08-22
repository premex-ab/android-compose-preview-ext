package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MHL device specifications for Android Compose previews.
 *
 * This extension provides MHL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mhl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mhl: Any
  get() = object {
      /** MHL TRECFONE_A21S */
      val TRECFONE_A21S = "spec:width=720,height=1520,unit=px,dpi=320"

  }
