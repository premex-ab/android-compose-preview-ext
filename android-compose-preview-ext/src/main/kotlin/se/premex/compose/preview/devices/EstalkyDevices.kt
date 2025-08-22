package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Estalky device specifications for Android Compose previews.
 *
 * This extension provides Estalky device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Estalky.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Estalky: Any
  get() = object {
      /** Estalky E618 */
      val E618 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
