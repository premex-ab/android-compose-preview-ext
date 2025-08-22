package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BUFF device specifications for Android Compose previews.
 *
 * This extension provides BUFF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Buff.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Buff: Any
  get() = object {
      /** BUFF X-9_LTEVII_PRO */
      val X_9_LTEVII_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
