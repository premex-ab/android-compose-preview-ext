package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ZELU device specifications for Android Compose previews.
 *
 * This extension provides ZELU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zelu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zelu: Any
  get() = object {
      /** ZELU C400 */
      val C400 = "spec:width=480,height=800,unit=px,dpi=240"

  }
