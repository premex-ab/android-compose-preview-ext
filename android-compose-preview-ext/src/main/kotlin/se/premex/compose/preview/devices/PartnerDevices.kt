package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Partner device specifications for Android Compose previews.
 *
 * This extension provides Partner device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Partner.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Partner: Any
  get() = object {
      /** Partner Batman */
      val BATMAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Partner uzw4054ptn */
      val UZW4054PTN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
