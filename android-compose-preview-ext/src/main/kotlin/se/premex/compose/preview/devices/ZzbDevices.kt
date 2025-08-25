package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.DeviceCatalog

/**
 * ZZB device specifications for Android Compose previews.
 *
 * This extension provides ZZB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = DeviceCatalog.Zzb.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val DeviceCatalog.Zzb: Any
  get() = object {
      /** ZZB ZB10 */
      val ZB10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ZZB ZB10M */
      val ZB10M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZZB ZB40 */
      val ZB40 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
