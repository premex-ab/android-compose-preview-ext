package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ClickTabDS device specifications for Android Compose previews.
 *
 * This extension provides ClickTabDS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Clicktabds.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Clicktabds: Any
  get() = object {
      /** ClickTabDS F19 */
      val F19 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
