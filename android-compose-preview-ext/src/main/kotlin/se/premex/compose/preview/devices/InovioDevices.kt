package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * INOVIO device specifications for Android Compose previews.
 *
 * This extension provides INOVIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Inovio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Inovio: Any
  get() = object {
      /** INOVIO EVO_TAB7 */
      val EVO_TAB7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
