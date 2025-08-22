package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CJHV device specifications for Android Compose previews.
 *
 * This extension provides CJHV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cjhv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cjhv: Any
  get() = object {
      /** CJHV kr101 */
      val KR101 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
