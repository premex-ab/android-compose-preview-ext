package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * WONGKUO device specifications for Android Compose previews.
 *
 * This extension provides WONGKUO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wongkuo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wongkuo: Any
  get() = object {
      /** WONGKUO T20 */
      val T20 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
