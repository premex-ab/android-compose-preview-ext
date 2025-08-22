package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TELOX device specifications for Android Compose previews.
 *
 * This extension provides TELOX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telox: Any
  get() = object {
      /** TELOX TE620G */
      val TE620G = "spec:width=640,height=1136,unit=px,dpi=320"

  }
