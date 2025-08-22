package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KYODO-TV device specifications for Android Compose previews.
 *
 * This extension provides KYODO-TV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KyodoTv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KyodoTv: Any
  get() = object {
      /** KYODO-TV KARAxKARA */
      val KARAXKARA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
