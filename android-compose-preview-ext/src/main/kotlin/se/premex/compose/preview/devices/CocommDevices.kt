package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * COCOMM device specifications for Android Compose previews.
 *
 * This extension provides COCOMM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cocomm.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cocomm: Any
  get() = object {
      /** COCOMM F900N0101 */
      val F900N0101 = "spec:width=600,height=1024,unit=px,dpi=240"

  }
