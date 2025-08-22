package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ARATEK device specifications for Android Compose previews.
 *
 * This extension provides ARATEK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aratek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aratek: Any
  get() = object {
      /** ARATEK Marshall-8 */
      val MARSHALL_8 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
