package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NOVINSUN device specifications for Android Compose previews.
 *
 * This extension provides NOVINSUN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Novinsun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Novinsun: Any
  get() = object {
      /** NOVINSUN TN618 */
      val TN618 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
