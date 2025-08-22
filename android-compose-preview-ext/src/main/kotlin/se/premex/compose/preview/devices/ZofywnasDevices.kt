package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ZOFYWNAS device specifications for Android Compose previews.
 *
 * This extension provides ZOFYWNAS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zofywnas.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zofywnas: Any
  get() = object {
      /** ZOFYWNAS D10 */
      val D10 = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
