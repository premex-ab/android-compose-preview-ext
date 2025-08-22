package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Beyond_PTE device specifications for Android Compose previews.
 *
 * This extension provides Beyond_PTE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BeyondPte.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BeyondPte: Any
  get() = object {
      /** Beyond_PTE MAX4 */
      val MAX4 = "spec:width=480,height=996,unit=px,dpi=240"

  }
