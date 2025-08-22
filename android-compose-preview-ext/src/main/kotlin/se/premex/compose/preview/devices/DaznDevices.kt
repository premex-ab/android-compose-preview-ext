package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DAZN device specifications for Android Compose previews.
 *
 * This extension provides DAZN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dazn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dazn: Any
  get() = object {
      /** DAZN m393gena_dazn */
      val M393GENA_DAZN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
