package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VAIO device specifications for Android Compose previews.
 *
 * This extension provides VAIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vaio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vaio: Any
  get() = object {
      /** VAIO VPA051 */
      val VPA051 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
