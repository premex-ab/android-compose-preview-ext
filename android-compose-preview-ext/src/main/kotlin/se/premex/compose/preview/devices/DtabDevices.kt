package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DTAB device specifications for Android Compose previews.
 *
 * This extension provides DTAB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dtab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dtab: Any
  get() = object {
      /** DTAB TK_P617_3_3Ghz */
      val TK_P617_3_3GHZ = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
