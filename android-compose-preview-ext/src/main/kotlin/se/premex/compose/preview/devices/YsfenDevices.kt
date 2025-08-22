package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * YSFEN device specifications for Android Compose previews.
 *
 * This extension provides YSFEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ysfen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ysfen: Any
  get() = object {
      /** YSFEN B9000 */
      val B9000 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
