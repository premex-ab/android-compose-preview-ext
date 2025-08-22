package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LePan device specifications for Android Compose previews.
 *
 * This extension provides LePan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lepan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lepan: Any
  get() = object {
      /** LePan UY8 */
      val UY8 = "spec:width=768,height=1024,unit=px,dpi=160"

  }
