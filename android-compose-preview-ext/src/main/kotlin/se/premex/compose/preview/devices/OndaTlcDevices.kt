package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ONDA_TLC device specifications for Android Compose previews.
 *
 * This extension provides ONDA_TLC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OndaTlc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OndaTlc: Any
  get() = object {
      /** ONDA_TLC T7_PRO */
      val T7_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

  }
