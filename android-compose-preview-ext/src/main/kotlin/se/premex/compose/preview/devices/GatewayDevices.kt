package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * gateway device specifications for Android Compose previews.
 *
 * This extension provides gateway device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gateway.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gateway: Any
  get() = object {
      /** gateway G1-715 */
      val G1_715 = "spec:width=600,height=976,unit=px,dpi=160"

  }
