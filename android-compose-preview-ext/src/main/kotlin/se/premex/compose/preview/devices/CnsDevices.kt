package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CNS device specifications for Android Compose previews.
 *
 * This extension provides CNS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cns.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cns: Any
  get() = object {
      /** CNS BCM72604 */
      val BCM72604 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
