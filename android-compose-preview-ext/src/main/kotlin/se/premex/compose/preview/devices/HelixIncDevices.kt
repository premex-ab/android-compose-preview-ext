package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HELIX_INC device specifications for Android Compose previews.
 *
 * This extension provides HELIX_INC device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HelixInc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HelixInc: Any
  get() = object {
      /** HELIX_INC C-TABLET */
      val C_TABLET = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
