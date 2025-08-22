package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BAYKUS device specifications for Android Compose previews.
 *
 * This extension provides BAYKUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Baykus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Baykus: Any
  get() = object {
      /** BAYKUS BKM10 */
      val BKM10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
